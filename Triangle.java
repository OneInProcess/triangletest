package test1;

public class Triangle {
	
	public int side_1;
	public int side_2;
	public int side_3;
	public Triangle(int side1, int side2, int side3) {
		if(isLegal(side1,side2,side3)) {
		side_1=side1;
		side_2=side2;
		side_3=side3;
		}else {
			System.out.println("not a triangle");
		}
	}
	public boolean isLegal(int side1, int side2, int side3) {
		if(side1<=0||side2<=0||side3<=0) {
			return false;
		}else if(side1+side2>=side3&&side2+side3>=side1&&side1+side3>=side2) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isequilateral() {
		if(side_1==side_2&&side_2==side_3) {
			return true;
		}else{
			return false;
		}
	}
	public boolean isisosceles() {
		if(side_1==side_2||side_2==side_3||side_1==side_3) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isscalene() {
		if(!isequilateral()&&!isisosceles()) {
			return true;
		}else {
			return false;
		}
	}
//	public static void main(String[] args) {
//		
//	}

}
