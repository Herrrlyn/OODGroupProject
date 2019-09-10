
CREATE TABLE customer  (
  customer_id NUMBER(8) NOT NULL,
  first_name VARCHAR2(50) NOT NULL,
  last_name VARCHAR2(50) NOT NULL,
  email VARCHAR2(254) NOT NULL,
  password NVARCHAR2(15) NOT NULL,
  profile_picture BLOB,
  CONSTRAINT customer_pk PRIMARY KEY(customer_id)
  );

CREATE TABLE administrator (
  employee_id NUMBER(8) NOT NULL,
  first_name VARCHAR2(50) NOT NULL,
  last_name VARCHAR2(50) NOT NULL,
  email VARCHAR2(254) NOT NULL,
  password NVARCHAR2(15) NOT NULL,
  profile_picture BLOB,
  CONSTRAINT admin_pk PRIMARY KEY(employee_id)
  )
;
CREATE TABLE complaints (
  complaint_id NUMBER(8) NOT NULL,
  created_by NUMBER(8) NOT NULL,
  date_created DATE NOT NULL,
  date_resolved DATE,
  department VARCHAR2(50),
  CONSTRAINT complaint_pk PRIMARY KEY(complaint_id),
  CONSTRAINT complaint_fk FOREIGN KEY (created_by) REFERENCES customer(customer_id)
  )
;
 CREATE TABLE comments (
  comment_id NUMBER(8) NOT NULL,
  text VARCHAR(500) NOT NULL,
  date_created DATE NOT NULL,
  created_by NUMBER(8) NOT NULL,
  CONSTRAINT comment_pk PRIMARY KEY(comment_id),
  CONSTRAINT customer_comment_fk FOREIGN KEY(created_by) REFERENCES customer(customer_id),
  CONSTRAINT admin_comment_fk FOREIGN KEY(created_by) REFERENCES administrator(employee_id)
)
;