package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//エンティティクラスにする
@Entity
@Table(name="user")
public class User {
	// データベースのテーブル設定(userテーブルにid,nameカラムの作成)
	@Id												// プライマリキー
	@GeneratedValue(strategy = GenerationType.AUTO)	// キーの値を自動生成
	private int id;
	
	@Column											// カラム設定
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
