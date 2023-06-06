package frontend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entity.Student;

public class Program {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		demoArrayListStudent();
	}

	public static void demoArrayListStudent() {
		List<Student> list = new ArrayList<>();
		Student a = new Student("a", (float) 10);
		Student b = new Student("b", (float) 9);
		Student c = new Student("c", (float) 8);
		Student d = new Student("d", (float) 7);

		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
//		//cau a
//		System.out.println("Tong so SV: ");
//		System.out.println(list.size());
//		
//		//cau b
//		try {
//		System.out.println("SV thu 4: ");
//		System.out.println(list.get(3));
//		}catch(IndexOutOfBoundsException e) {
//			System.out.println("Vuot mang roi");
//		}

		// cau c
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));

		// cau d
		list.add(0, new Student("e", (float) 5));

		// cau e
		list.add(new Student("f", (float) 9));
		list.add(new Student("f", (float) 10));

		// cau f
		// Collections.reverse(list);

		System.out.println(list);
		// cau g
//		int searchId = 3;
//		Student foundStudentById = findStudentById(list, searchId);
//		if (foundStudentById != null) {
//			System.out.println("Sinh viên Id = " + searchId + " tên là " + foundStudentById.getName());
//		} else {
//			System.out.println("Không tìm thấy sinh viên có Id = " + searchId);
//		}
//	}
		
		//cau h
//		String searchName = "a";
//		Student foundStudentByName = findStudentByName(list, searchName);
//		if(foundStudentByName!=null){
//			System.out.println("Sinh viên tên " + searchName + " có id là: " + foundStudentByName.getId());
//		}else {
//		System.out.println("Không tìm thấy sinh viên có tên là " + searchName);
//		}
//	}

		//câu i:
//		ArrayList<Student> duplicateStudents = findDuplicateStudents(list);
//		System.out.println("Các sinh viên trùng tên: ");
//		for(Student student : duplicateStudents) {
//			System.out.println(student.getName());}
//		}


//		//câu j:
//		int deleteId = 5;
//		Student studentToDelete = findStudentById(list, deleteId);
//		if(studentToDelete != null) {
//			studentToDelete.setName("");
//			System.out.println("Đã xóa tên của sinh viên có Id = " + deleteId);
//		}else {
//			System.out.println("Không tìm thấy sinh viên có Id = " + deleteId);
//		}
//	}
	
		//câu k
		int deleteId = 5;
		Student studentToDelete = findStudentById(list, deleteId);
		if (studentToDelete != null) {
			list.remove(studentToDelete);
			System.out.println("Đã xóa sinh viên có Id = " + deleteId);
		}else {
			System.out.println("KHông tìm thấy sinh viên có Id = " + deleteId);
		}
		
		//câu l
		ArrayList<Student> studentCopy = new ArrayList<>(list);
	}
	
	
	 //method kiếm student theo id - câu g
	private static Student findStudentById(List<Student> list, int searchId) {
		// TODO Auto-generated method stub
		for(Student student : list) {
			if(student.getId() == searchId) {
				return student;
			}
		}
		return null;
	}

//		//method tìm student trùng tên - câu i
//	private static ArrayList<Student> findDuplicateStudents(List<Student> list) {
//		// TODO Auto-generated method stub
//		ArrayList<Student> duplicateStudents = new ArrayList<>();
//		for(int i = 0; i < list.size(); i ++) {
//			for(int j = i + 1; j < list.size(); j++) {
//				if(list.get(i).getName().equals(list.get(j).getName())) {
//					duplicateStudents.add(list.get(i));
//					break;
//				}
//			}
//		}
//		return duplicateStudents;
//	}
	
//		//method tìm student by name - câu h
//	private static Student findStudentByName(List<Student> list, String searchName) {
//		// TODO Auto-generated method stub
//		for (Student student : list) {
//			if(student.getName().equals(searchName)) {
//				return student;
//			}
//		}
//		return null;
//	}
//	public static void collection() {
//		int a[] = new int[50];
//		int b[] = new int[100];
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1, 100);
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
//	}
//
//
//	public static void demoFile() throws IOException {
//		FileInputStream fileInputStream = new FileInputStream(
//				"C:\\Users\\Nguyen Quang Phat\\Desktop\\BrSE\\Java\\a.txt");
//		byte b[] = new byte[1024];
//		int length = fileInputStream.read(b);
//		System.out.println(length);
//		while (length > -1) {
//			String content = new String(b, 0, length);
//			System.out.println(content);
//			length = fileInputStream.read(b);
//		}
//	}
//
//	public static void demoFile5() throws IOException {
//		Student a = new Student("Dung", (float) 10);
//		FileOutputStream fileOutputStream = new FileOutputStream(
//				"C:\\\\Users\\\\Nguyen Quang Phat\\\\Desktop\\\\BrSE\\\\Java\\f.ser");
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//		objectOutputStream.writeObject(a);
//	}
//
//	public static void demoFile6() throws IOException, ClassNotFoundException {
//		FileInputStream fileInputStream = new FileInputStream(
//				"C:\\\\\\\\Users\\\\\\\\Nguyen Quang Phat\\\\\\\\Desktop\\\\\\\\BrSE\\\\\\\\Java\\\\g.ser");
//		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//		Object obj = objectInputStream.readObject();
//		Student s = (Student) obj;
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getScore());
//	}
//}

	
	
}