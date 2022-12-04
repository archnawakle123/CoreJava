package com.demo;

public class MethodOverlodding_demo {
		public void m1(int a) {
			System.out.println(a);
		}
		
		private void m1(double a) {
			System.out.println(a);
		}
		
		void m1(boolean a) {
			System.out.println(a);
		}
		protected void m1(float a) {
			System.out.println(a);
		}
		public static void main(String[] args) {
			MethodOverlodding_demo d=new MethodOverlodding_demo();
			d.m1(false);
			d.m1(111);
			d.m1(22.2);
			d.m1(12.4f);
		}
}
