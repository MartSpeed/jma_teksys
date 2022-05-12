# **Maven**

- _read through the following slides_

1. [] Build Management Tools (Maven)
2. [] Day 1 and Day 2 - Hibernate
3. [] Install Maven
4. [] [Maven Project Builder](https://start.spring.io/)

---

<p>
  <header>(JPA) Java Persistence API</header>
there is a different way of getting, getters/setters
there is going to be a different way to make our constructors
entity or models are our objects using throughout the app
this is where objects will be stored.
POJO = plain old java object
</p>

---

# **SQL SBA**

## Question 5

```
[] course names
[] number of students

[] number of students desc, course name ASC
course.id = studentCourse.courseId

course name > number of student
*/

SELECT
    course.name,
    COUNT(studentCourse.studentId)
FROM
    course
JOIN
    studentCourse
ON
    course.id = studentCourse.courseId
WHERE
    course.id NOT IN (SELECT courseId from facultyCourse)
GROUP BY
    course.id
ORDER BY
    COUNT(studentCourse.studentId) desc,
    course.name asc
```

## Question 6

```
/*
Enter your query below.
Please append a semicolon ";" at the end of the query
[] lists total number of students SUM()
[] school year???
[] first column AS Students
[] second column AS Year
School Year ASC > TOTAL students DESC
*/

-- WHY DOES THIS NOT WORK
SELECT
    COUNT(DISTINCT (student.id) AS Students,
    DATE_FORMAT(studentCourse.startDate, "%Y") AS Year
FROM
    studentCourse
JOIN
    student
ON
    student.id = studentCourse.studentId
Group BY
    studentCourse.startDate
ORDEr BY
    Year asc,
    COUNT(DISTINCT Students,) desc

-- THIS IS THE CORRECT FORMULA =_=
SELECT count(DISTINCT(studentID)) as Students, year(startDate) as Year
FROM studentCourse
GROUP BY YEAR
ORDER BY Year, Students DESC;
```

## Question 7

```
-- BAD ANSWER
    startDate,
    SUM(studentId)
FROM
    studentCourse
group by
    startDate, studentId
order by
    startDate asc, studentId asc


-- GOOD ANSWER
SELECT DATE_FORMAT(startDate, '%Y-%m-%d') AS "Start Date", COUNT(DISTINCT(studentId)) AS "# Students"
FROM studentCourse
WHERE MONTH(startDate) = 08
GROUP BY startDate
ORDER BY DATE_FORMAT(startDate, '%Y-%m-%d') ASC, COUNT(studentId) ASC;
```

## Question 7

```
--- CODE THAT DIDNT WORK
/*
Enter your query below.
Please append a semicolon ";" at the end of the query

[] firstName, lastName, number of courses in their major
[] sorted by number of courses desc, first name asc, last name asc

student >JOIN> department >JOIN> course >JOIN> studentCourse >JOIN> student

group things that connect to the table
*/

SELECT
    student.firstname,
    student.lastname,
    COUNT(studentCourse.courseId)
FROM
    student
JOIN
    department
ON
    student.majorId = department.id
JOIN
    course
ON
    department.id = course.deptId
JOIN
    studentCourse
ON
    course.id = studentCourse.courseId
GROUP BY
    studentCourse.courseId,
    student.firstname,
    student.lastname
ORDER BY
    COUNT(studentCourse.courseId) desc,
    student.firstname asc,
    student.lastname asc

--- CODE THAT WORKED
SELECT s.firstname AS "First Name", s.lastname AS "Last Name", COUNT(c.deptId)
AS "Number of Courses"
        FROM student s
        INNER JOIN studentCourse sc ON (s.id = sc.studentId)
        INNER JOIN course c ON (sc.courseId = c.id)
        WHERE s.majorId = c.deptId
        GROUP BY s.firstname, s.lastname
        ORDER BY COUNT(sc.courseId) DESC, s.firstName ASC, s.lastName ASC;
```

## 9

-- CODE THA DIDNT WORK

```
SELECT
    student.firstname,
    student.lastname,
    AVG(studentCourse.progress)
FROM
    student
JOIN
    studentCourse
ON
    student.id = studentCourse.studentId
Group BY
    student.id
order BY
    ROUND(AVG(studentCourse.progress), 1) desc,
    student.firstname asc,
    student.lastname asc

--- CODE THAT WORKED
SELECT
  s.firstname AS student_first_name,
  s.lastname AS student_last_name,
  ROUND(AVG(sc.progress), 1) AS average_progress
FROM
  student AS s
JOIN
  studentCourse AS sc
ON
  s.id = sc.studentId
GROUP BY
  student_first_name, student_last_name
HAVING
  average_progress < 50
ORDER BY
  average_progress DESC,
  student_first_name ASC,
  student_last_name ASC;

```

## 10

```
--- CODE THAT DIDNT WORK
SELECT
    course.name,
    ROUND(AVG(studentCourse.progress), 1)
from
   course
JOIN
    studentCourse
ON
    studentCourse.studentId = course.id
GROUP BY
    studentCourse.progress
ORDER BY
    studentCourse.progress desc,
    course.name asc

--- CODE THAT WORKED
SELECT
c.name AS course_name,
ROUND(AVG(sc.progress), 1) AS average_progress
FROM course AS c
JOIN studentCourse AS sc
ON c.id = sc.courseId
GROUP BY course_name
ORDER BY
average_progress DESC,
course_name ASC;
```

## 11

```
--- CODE THAT DIDNT WORK
select course.name, AVG(studentCourse.progress)
from course
join studentCourse
on course.id = studentCourse.courseId
group by course.id
order by MAX(ROUND(studentCourse.progress, 1))

--- CODE THAT WORKED
SELECT
c.name AS course_name,
ROUND(AVG(sc.progress), 1) AS average_progress
FROM course AS c
JOIN studentCourse AS sc
ON c.id = sc.courseId
GROUP BY course_name
ORDER BY average_progress DESC
LIMIT 1;
```

## 12

```
--- CODE THAT DIDNT WORK
select
    faculty.firstname,
    faculty.lastname,
    AVG(studentCourse.progress)
FROM
    faculty
join
    department
ON
    faculty.deptId = department.id
JOIN
    course
on
    department.id = course.deptId
JOIN
    studentCourse
on
    course.id = studentCourse.courseId
group BY
    faculty.firstname,
    faculty.lastname,
    studentCourse.progress
order BY
    studentCourse.progress desc,
    faculty.firstname asc,
    faculty.lastname asc

--- CODE THAT WORKED
SELECT
f.firstname AS faculty_first_name,
f.lastname AS faculty_last_name,
ROUND(AVG(sc.progress), 1) AS average_progress
FROM faculty AS f
JOIN facultyCourse AS fc
ON f.id = fc.facultyId
JOIN course AS c
ON fc.courseId = c.id
JOIN studentCourse AS sc
ON c.id = sc.courseId
GROUP BY faculty_first_name, faculty_last_name
ORDER BY
average_progress DESC,
faculty_first_name ASC,
faculty_last_name ASC;
```

## 13

```
--- CODE THAT DIDNT WORK
SELECT
    faculty.firstname,
    faculty.lastname,
    AVG(studentcourse.progress)
FROM
    faculty
JOIN
    department
on
    faculty.deptid = department.id
JOIN
    course
ON
    department.id = course.deptid
join
    studentCourse
on
    course.id = studentCourse.courseid
group BY
    faculty.firstname,
    faculty.lastname,
    studentCourse.progress
order BY
    ROUND(studentCourse.progress,1) desc,
    faculty.firstname asc,
    faculty.lastname asc

--- CODE THAT WORKED
SELECT
f.firstname AS faculty_first_name,
f.lastname AS faculty_last_name,
ROUND(AVG(sc.progress), 1) AS average_progress
FROM faculty AS f
JOIN facultyCourse AS fc
ON f.id = fc.facultyId
JOIN course AS c
ON fc.courseId = c.id
JOIN studentCourse AS sc
ON c.id = sc.courseId
GROUP BY faculty_first_name, faculty_last_name
HAVING
average_progress >= 0.9*(
    SELECT
    AVG(progress) AS average_progress
    FROM studentCourse
    GROUP BY courseId
    ORDER BY average_progress DESC
    LIMIT 1
)
ORDER BY
average_progress DESC,
faculty_first_name ASC,
faculty_last_name ASC;
```

## 14

```
--- CODE THAT DIDNT WORKED
SELECT
    student.firstname,
    student.lastname,
    studentCourse.progress
FROM
    studentCourse
on
    studentCourse.studentId = student.id
group BY
    student.firstname,
    student.lastname,
    studentCourse.progess,
order BY
    MIN(studentCourse.progess) desc,
    MAX(studentCourse.progress) desc,
    student.firstname asc,
    student.lastname asc

--- CODE THAT WORKED
SELECT
s.firstname AS student_first_name,
s.lastname AS student_last_name,
CASE
WHEN MIN(sc.progress) < 40 THEN 'F'
WHEN MIN(sc.progress) < 50 THEN 'D'
WHEN MIN(sc.progress) < 60 THEN 'C'
WHEN MIN(sc.progress) < 70 THEN 'B'
ELSE 'A'
END AS minimum_grade,
CASE
WHEN MAX(sc.progress) < 40 THEN 'F'
WHEN MAX(sc.progress) < 50 THEN 'D'
WHEN MAX(sc.progress) < 60 THEN 'C'
WHEN MAX(sc.progress) < 70 THEN 'B'
ELSE 'A'
END AS maximum_grade
FROM student AS s
JOIN studentCourse AS sc
ON s.id = sc.studentId
GROUP BY student_first_name, student_last_name
ORDER BY
minimum_grade DESC,
maximum_grade DESC,
student_first_name ASC,
student_last_name ASC;
```
