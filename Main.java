class Student {

    private String name;
    private String school;
    private String subject;
    private int score;

    Student(String name, String school, String subject, int score) {
        this.name = name;
        this.school = school;
        this.subject = subject;
        this.setScore(score);
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100");
            return;
        }

        this.score = score;
    }

    public String scoreCheck() {

        String grade;

        if (score >= 70) {
            grade = "Excellent";
        } else if (score >= 60) {
            grade = "Very Good";
        } else if (score >= 50) {
            grade = "Good";
        } else if (score >= 40) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        return "Welcome " + name
                + " from " + school
                + ", your score in " + subject
                + " is " + score
                + ", remark is: " + grade;
    }
}


class PrimaryStudent extends Student {

    private int classLevel;

    PrimaryStudent(
            String name,
            String school,
            String subject,
            int score,
            int classLevel
    ) {

        // Call the parent constructor
        super(name, school, subject, score);

        this.classLevel = classLevel;
    }

    public int getClassLevel() {
        return classLevel;
    }
}


class SecondaryStudent extends Student {

    private int classLevel;

    SecondaryStudent(
            String name,
            String school,
            String subject,
            int score,
            int classLevel
    ) {

        super(name, school, subject, score);

        this.classLevel = classLevel;
    }

    // Getter
    public int getClassLevel() {
        return classLevel;
    }

    @Override
    public String scoreCheck() {

        if (getScore() >= 75) {
            return getName() + " achieved Distinction";
        }

        if (getScore() >= 60) {
            return getName() + " achieved Credit";
        }

        if (getScore() >= 50) {
            return getName() + " achieved Pass";
        }

        return getName() + " failed";
    }
}


public class Main {

    public static void main(String[] args) {

        PrimaryStudent primaryStudent = new PrimaryStudent(
                "Femi",
                "Mushin Primary School",
                "Mathematics",
                85,
                5
        );
        System.out.println(primaryStudent.scoreCheck());
        System.out.println("Class: " + primaryStudent.getClassLevel());
        SecondaryStudent secondaryStudent = new SecondaryStudent(
                "Joshua",
                "Lagos High School",
                "Economics",
                78,
                3
        );
        System.out.println(secondaryStudent.scoreCheck());
        System.out.println("Class: " + secondaryStudent.getClassLevel());
        secondaryStudent.setScore(65);
  System.out.println(secondaryStudent.scoreCheck());
 secondaryStudent.setScore(150);
System.out.println("Current score: " + secondaryStudent.getScore());
    }
}



git init
git add .
git commit -m "first commit"
git remote add origin https://github.com/aninkud2/MY-JAVA-JOURNEY.git
git push -u origin main