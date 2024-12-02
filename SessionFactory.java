public class SessionFactory {

    public static Session createSession(SessionType type, String date, ForumType forum, Instructor instructor) throws InstructorNotQualifiedException {

        if (instructor == null || !instructor.isQualifiedFor(type)) {
            throw new InstructorNotQualifiedException("Error: Instructor is not qualified to conduct this session type.");
        }

        return new Session(type, date, forum, instructor);
    }
}
