package DTO;

import java.time.LocalDate;

public class CommentDTO {

	private int commentId;
	private int boardId;
	private String writer;
	private String comment;
	private LocalDate writeDate;
	
	public static CommentDTO of(int comment_id, int board_id, String writer, String comment, LocalDate write_date) {
		
		return null;
	}

}