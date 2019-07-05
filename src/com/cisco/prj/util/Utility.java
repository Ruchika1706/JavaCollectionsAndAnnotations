package com.cisco.prj.util;

import java.lang.reflect.Method;

import com.cisco.prj.annotation.Column;
import com.cisco.prj.annotation.Table;

public class Utility {
	public static void sort(Comparable[] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = i + 1; j < elems.length; j++) {
				if (elems[i].compareTo(elems[j]) > 0) {
					Comparable temp = elems[i];
					elems[i] = elems[j];
					elems[j] = temp;
				}
			}
		}

	}

	public static String createSQL(Class<?> clazz) {
		StringBuilder builder = new StringBuilder();
		Table t = (Table) clazz.getAnnotation(Table.class);
		if (t != null) {
			builder.append("create table ");
			builder.append(t.name());
			builder.append("(");

			Method[] methods = clazz.getMethods();
			for (Method m : methods) {
				if (m.getName().startsWith("get")) {
					Column c = m.getAnnotation(Column.class);
					if (c != null) {
						builder.append(c.name());
						builder.append(" ");
						builder.append(c.type());
						builder.append(",");
					}
				}
			}
			builder.setCharAt(builder.lastIndexOf(","), ')');
			builder.append(";");
		}

		return builder.toString();
	}
}
