class Student:
    def __init__(self, rollno, name, score):
        self.rollno = rollno
        self.name = name
        self.score = score

    def finalgrade(self):
        if self.score >= 80 and self.score <= 100:
            grade = "A"
        elif self.score >= 60 and self.score < 80:
            grade = "B"
        elif self.score >= 40 and self.score < 60:
            grade = "C"
        else:
            grade = "D"
        print(grade)


student = Student(8702, "Dhananjay", 65)
student.finalgrade()

