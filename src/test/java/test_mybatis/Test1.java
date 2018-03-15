package test_mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jay.entity.Song;
import com.jay.mapper.SongMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Test1 {
	
	@Autowired
	private SongMapper songMapper;
	
//	@Test
//	public void test1(){
//		List<Song> list = songMapper.queryAll();
//		for(Song s: list){
//			System.out.println(s);
//		}
//	}
	
	@Test
	public void test4(){
		Song s = new Song();
		s.setId(5);
		s.setAlbum("依然范特西");
		s.setName("夜的第七章");
		s.setTime(2006);
		
		songMapper.update(s);
	}
}
