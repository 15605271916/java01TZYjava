package day081802面向对象02abstract抽象01;
//矩形
public class ShapeRect extends Shape {

//	public int getArea(int w, int h, int r) {
//
//		super.setSize(w, h, r);
//
//		return w * h;
//
//	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return heigth*width;
	}
}
