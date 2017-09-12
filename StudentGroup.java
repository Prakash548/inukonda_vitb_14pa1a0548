import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private static final Exception IllegalArgumentException = null;
	private static final Student[] NULL = null;
	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		try{
			if(students==NULL)
                throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException te)
		      System.out.println("An Illegal argument(array out of bound) exception occurs.");
				
	}

	@Override
	public Student getStudent(int index) {
			try{
				if(index<0 || index>students.length)
	                throw new IllegalArgumentException();
				else
					return students[index];
			}
			catch(IllegalArgumentException le)
			      System.out.println("An Illegal argument(array out of bound) exception occurs.");
					
	}

	@Override
	public void setStudent(Student student, int index) {
		try{
			if((index<0 || index>students.length)||student==null)
                throw new IllegalArgumentException();
			else
				students[index]=student;
		}
		catch(IllegalArgumentException te)
		      System.out.println("An Illegal argument(array out of bound) exception occurs.");
	}

	@Override
	public void addFirst(Student student) {
		Student temp,ktemp;
		int i;
		try{
			if(student==null)
                throw new IllegalArgumentException();
			else {
					temp=students[0];
					students[0]=student;
					for(i=1;i<=students.length;i++) {
                        ktemp=students[i];   
						students[i]=temp;
                           temp=ktemp;
					}
				
			}
				
		}
		catch(IllegalArgumentException le)
		      System.out.println("An Illegal argument(array out of bound) exception occurs.");

	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Student temp,ktemp;
		int i;
		try{
			if((student==null)
                throw new IllegalArgumentException();
			else {
				i=students.length;
					students[i+1]=student;
				
			}
				
		}
		catch(IllegalArgumentException le)
		      System.out.println("An Illegal argument(array out of bound) exception occurs.");

	}

	@Override
	public void add(Student student, int index) {
		Student temp,ktemp;
		int i;
		try{
			if((index<0 || index>students.length)||student==null)
                throw new IllegalArgumentException();
			else {
					temp=students[index];
					students[index]=student;
					for(i=index;i<=students.length;i++) {
						ktemp=students[index+i];
						students[index+i]=temp;
						temp=ktemp;
					}
				
			}
				
		}
		catch(IllegalArgumentException le)
		      System.out.println("An Illegal argument(array out of bound) exception occurs.");
	}

	@Override
	public void remove(int index) {
		Student temp,ktemp;
		int i;
		try{
			if((index<0 || index>students.length)||(student==null))
                throw new IllegalArgumentException();
			else {
				for(i=index;i<students.length;i++) {
						students[index]=students[index+1];
				}
				
			}
				
		}
		catch(IllegalArgumentException le)
		      System.out.println("An Illegal argument(array out of bound) exception occurs.");

	}

	@Override
	public void remove(Student student) {
		Student temp,ktemp;
		int i,j,flag=0;
		try{
			if((student==null)
                throw new IllegalArgumentException();
			else {
				   for(i=0;i<=students.length;i++) {
					   if(students[i]==student) {
						   for(j=i;i<students.length;j++) {
								students[j]=students[j+1];
								flag=1;
					   }
				  }
				}
				   if(flag==0)
					   throw new IllegalArgumentException();
			}
				
		}
		catch(IllegalArgumentException le)
		      System.out.println("Student not found in ther array");

	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		Student temp,ktemp;
		int i,j,flag=0;
		try{
			if(index== 0)
                throw IllegalArgumentException;
			else {
				   for(i=0;i<=students.length;i++) {
					   if(students[i]==student) {
						   for(j=i;i<students.length;j++) {
								students[j]=students[j+1];
								flag=1;
					   }
				  }
				}
				   if(flag==0)
					   throw new IllegalArgumentException();
			}
				
		}
		catch(IllegalArgumentException le)
		      System.out.println("Student not found in ther array");

	}

	@Override
	public void removeFromElement(Student student) {
		int i=0;
		for(i=0;i<students.length;i++) {
			if(students[i]==student)
				break;
		}
		for(;i<students.length;i++) {
			students[i]=null;
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		for(i=0;i<students.length;i++) {
			if(i==index)
				break;
		}
		for(;i<students.length;i++) {
			students[i]=null;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		for(i=0;i<students.length;i++) {
			if(students[i]==student)
				break;
		}
		for(j=0;j<i;j++) {
			students[j]=null;
		}
	}

	@Override
	public void bubbleSort() {
		int i,j;
		students temp;
		for(i=0;i<students.length;i++){
			for(j=i;j<students.length-1;j++) {
				if(students[i]>students[j]) {
					temp=students[i];
					students[i]=students[j];
					students[j]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
