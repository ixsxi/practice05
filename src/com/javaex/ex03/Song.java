package com.javaex.ex03;

public class Song {

	// 필드

	private String tilte;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// 생성자

	public Song() {
		System.out.println("Song 파라미터 0개");
	}

	public Song(String tilte, String artist, String album, String composer, String year) {

		this.tilte = tilte;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("파라미터 5개");
	}

	public Song(String tilte, String artist, String album, String composer, String year , int track) {
	
		this(tilte,artist,album,composer,year);
		this.track =track;
		System.out.println("파라미터 6개");
	}
	
	
	

}
