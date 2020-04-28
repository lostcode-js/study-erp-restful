package test;

import util.SessionFactoryUtil;

public class GeraTabelaTeste {

	public static void main(String[] args) {
		try {
			SessionFactoryUtil.getSessionFactory();
			SessionFactoryUtil.getSessionFactory().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
