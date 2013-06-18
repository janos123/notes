-- all tables in the database
SELECT * FROM sysobjects WHERE type='U' order by name

-- all columns of a table
SELECT syscolumns.name, syscolumns.* 
FROM syscolumns JOIN sysobjects
       ON syscolumns.id=sysobjects.id
WHERE sysobjects.name='the_table'
