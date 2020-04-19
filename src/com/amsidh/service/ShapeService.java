package com.amsidh.service;

import com.amsidh.dto.Circle;
import com.amsidh.dto.Triangle;

public class ShapeService {
	private Triangle triangle;
	private Circle circle;

	/**
	 * @return the triangle
	 */
	public Triangle getTriangle() {
		return triangle;
	}

	/**
	 * @param triangle
	 *            the triangle to set
	 */
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	/**
	 * @return the circle
	 */
	public Circle getCircle() {
		return circle;
	}

	/**
	 * @param circle
	 *            the circle to set
	 */
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

}
