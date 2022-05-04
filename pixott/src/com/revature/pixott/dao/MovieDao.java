package com.revature.pixott.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.handler.MovieHandler;
import com.revature.pixott.model.Movie;
public class MovieDao {
	public static  void Top5(){
		String sql=" select* from top5movie join movie where top5movie=movie.id";
		List <Movie>movies =new ArrayList<>();
				try (
						Connection conn = Util.getConnection(); 
						PreparedStatement stmt = conn.prepareStatement(sql);
						)
				{
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					Movie movie=new Movie();
					movie.setId(rs.getInt("id"));
					movie.setName(rs.getString("name"));
					movie.setGenre(rs.getString("genre"));
					movie.setSales(rs.getDouble("sales"));
					movie.setYear(rs.getInt("year"));
					movies.add(movie);
				}
				}catch (SQLException e) {
					Util.displayMessage(e);
					
				}
				System.out.printf("%-20s  %-40s  %-20s ","id","name","year");
				System.out.println(" ");
				movies.forEach(games->System.out.println(games));

	}
	public static  void search(String search){
		String symbol ="%";
		String sql=String.format("select* from movie where name like '%s%s%s'",symbol,search,symbol);
		List <Movie>movies =new ArrayList<>();
				try (
						Connection conn = Util.getConnection(); 
						PreparedStatement stmt = conn.prepareStatement(sql);
						)
				{
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					Movie movie=new Movie();
					movie.setId(rs.getInt("id"));
					movie.setName(rs.getString("name"));
					movie.setGenre(rs.getString("genre"));
					movie.setSales(rs.getDouble("sales"));
					movie.setYear(rs.getInt("year"));
					movies.add(movie);
				}
				}catch (SQLException e) {
					Util.displayMessage(e);
					
				}
				System.out.printf("%-20s  %-40s  %-20s ","id","name","year");
				System.out.println(" ");
				movies.forEach(games->System.out.println(games));
				MovieHandler.main();
	}

}