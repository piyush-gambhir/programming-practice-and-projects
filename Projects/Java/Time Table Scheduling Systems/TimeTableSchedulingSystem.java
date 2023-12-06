import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// represents a specific time slot in the timetable
class TimeSlot {
    private int slotNumber; // numerical identifier for the slot within the day
    private boolean isBooked; // status to check if the slot is already booked

    TimeSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isBooked = false; // all slots start as not booked
    }

    // getter for slotNumber
    public int getSlotNumber() {
        return slotNumber;
    }

    // getter for isBooked
    public boolean isBooked() {
        return isBooked;
    }

    // setter for isBooked, to update the slot's booking status
    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}

// represents a course with a name, a list of required time slots, and
// additional properties
class Course {
    private String name; // name of the course (e.g., "Math Lecture")
    private List<TimeSlot> timeSlots; // time slots required for the course
    private Type type; // type of the course: lecture, tutorial, or lab
    private int duration; // number of slots the course requires

    // enum to represent course types
    enum Type {
        LECTURE, TUTORIAL, LAB
    }

    // constructor for course
    Course(String name, Type type, int duration) {
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.timeSlots = new ArrayList<>();
    }

    // method to add a time slot to the course
    public void addTimeSlot(TimeSlot timeSlot) {
        timeSlots.add(timeSlot);
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for timeslots
    public List<TimeSlot> getTimeSlots() {
        return timeSlots;
    }

    // getter for type
    public Type getType() {
        return type;
    }

    // getter for duration
    public int getDuration() {
        return duration;
    }
}

// handles the scheduling of courses into time slots
class Scheduler {
    private List<TimeSlot> slots; // list of all time slots for the day
    private Set<String> scheduledCourseNames; // set to keep track of already scheduled course names

    Scheduler() {
        slots = new ArrayList<>();
        scheduledCourseNames = new HashSet<>(); // initializes the set to store scheduled course names
        // initialize time slots for a day, assuming 12 slots for simplicity
        for (int i = 1; i <= 12; i++) {
            slots.add(new TimeSlot(i));
        }
    }

    // schedules all courses provided in the list
    public void scheduleCourses(List<Course> courses) {
        for (Course course : courses) {
            // check if the course with the same name has already been scheduled today
            if (scheduledCourseNames.contains(course.getName())) {
                System.out.println("error: the course " + course.getName() + " is already scheduled today.");
                continue;
            }

            boolean scheduled = false; // flag to indicate if the course was successfully scheduled
            switch (course.getType()) {
                case LECTURE:
                    scheduled = scheduleLecture(course); // attempt to schedule a lecture
                    break;
                case TUTORIAL:
                    scheduled = scheduleTutorial(course); // attempt to schedule a tutorial
                    break;
                case LAB:
                    scheduled = scheduleLab(course); // attempt to schedule a lab
                    break;
            }

            if (scheduled) {
                // if scheduled, add course name to the set to avoid duplicate scheduling
                scheduledCourseNames.add(course.getName());
            }
        }
    }

    // attempts to schedule a lecture, ensuring it's within slots 7 to 12
    private boolean scheduleLecture(Course course) {
        for (TimeSlot slot : slots) {
            if (!slot.isBooked() && slot.getSlotNumber() >= 7 && slot.getSlotNumber() <= 12) {
                slot.setBooked(true);
                course.addTimeSlot(slot);
                return true; // lecture scheduled successfully
            }
        }
        System.out.println("error: unable to schedule lecture for " + course.getName());
        return false; // scheduling failed
    }

    // attempts to schedule a tutorial, which can only take place in slots 1 and 6
    private boolean scheduleTutorial(Course course) {
        // check for slot 1 first
        if (!slots.get(0).isBooked()) {
            slots.get(0).setBooked(true);
            course.addTimeSlot(slots.get(0));
        } else if (!slots.get(5).isBooked()) { // then check for slot 6
            slots.get(5).setBooked(true);
            course.addTimeSlot(slots.get(5));
        } else {
            System.out.println("error: unable to schedule tutorial for " + course.getName());
            return false; // both slot 1 and 6 are booked, cannot schedule tutorial
        }
        return true; // tutorial scheduled successfully
    }

    // attempts to schedule a lab, which requires 3 consecutive slots
    private boolean scheduleLab(Course course) {
        List<TimeSlot> consecutiveSlots = new ArrayList<>(); // to hold potential consecutive slots for the lab
        for (int i = 0; i < slots.size(); i++) {
            if (!slots.get(i).isBooked()) {
                consecutiveSlots.add(slots.get(i));
                // if 3 consecutive slots are found, schedule them
                if (consecutiveSlots.size() == course.getDuration()) {
                    consecutiveSlots.forEach(slot -> {
                        slot.setBooked(true);
                        course.addTimeSlot(slot);
                    });
                    return true; // lab scheduled successfully
                }
            } else {
                // reset the list if a booked slot is found before gathering 3 slots
                consecutiveSlots.clear();
            }
        }
        System.out.println("error: unable to schedule lab for " + course.getName());
        return false; // not enough consecutive slots available for lab
    }
}

public class TimeTableSchedulingSystem {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();

        // creating courses with their respective types and durations
        Course mathLecture = new Course("Math Lecture", Course.Type.LECTURE, 2);
        Course physicsTutorial = new Course("Physics Tutorial", Course.Type.TUTORIAL, 2);
        Course chemistryLab = new Course("Chemistry Lab", Course.Type.LAB, 3);
        Course chemistryLecture = new Course("Chemistry Lecture", Course.Type.LECTURE, 2);

        // adding courses to the list
        List<Course> courses = new ArrayList<>();
        courses.add(mathLecture);
        courses.add(physicsTutorial);
        courses.add(chemistryLab);
        courses.add(chemistryLecture);

        // scheduling the courses
        scheduler.scheduleCourses(courses);

        // outputting the scheduled courses and their time slots
        courses.forEach(course -> {
            System.out.println("course: " + course.getName());
            course.getTimeSlots().forEach(slot -> System.out.println(" - slot: " + slot.getSlotNumber()));
        });
    }
}
