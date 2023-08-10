package org.sytem;



	public class Department extends collage {
		
		public void departmentName() {
			System.out.println("CSE");
		}
	
		
		

		public static void main(String[] args) {
			Department calls = new Department();
			calls.departmentName();
            calls.collageName();
            calls.collageCode();
		}

	}
