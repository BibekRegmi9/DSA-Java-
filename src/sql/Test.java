package sql;

public class Test {
    // second highest salary
    //select max(salary) from employees where salary < (select max(salary) from employee);

//    Increase the income of all employees by 5% in a table
//    update employees set income = income + (income * 5.0 / 100.0);

//    Find names of employees starting with "A".
//    select * from employee where name like 'a%';

//    Print details of employees whose first name ends with 'A' and contains 6 alphabets.
//    select * from employee where first_name like '_____A';

//    Print details of employees whose salary lies between 10000 to 50000.
//    select * from employees where salary between 10000 and 20000;

//    Fetch duplicate records from the table.
//    select name, count(*) from employee group by name having count(*) > 1;
//    select name, count(*) from employee group by name having count(*) > 1;

//    SQL query to find Nth highest salary
//    select distinct salary from employee from employee order by salary desc limit 1 offset2;

//    Get Employees Hired in the Last 8 Months.
//    select * from employee where hire_date >= CURDATE() - INTERVAL 8 MONTH

//    Find employees who have worked for more than one department.
//    select emp_id from employee_history group by employee_id having count(dep_id) > 1;

//    Fetch common records between two tables
//    select * from table1 intersect select * from table2;

//    Create an empty table with the same structure as the other table.
//    select * into employee_2 from employee_1 where  1 = 0;

//    To display users who have placed fewer than 3 orders, let's assume you have two tables Accounts and Orders
//    select a.user_id , a.name , count(o.order_id) as order_count
//            from Accounct a
//    join order o on a.user_id = a.user_id
//    group by a.user_id, a.name
//    having count(p.order_id) < 3;
}
