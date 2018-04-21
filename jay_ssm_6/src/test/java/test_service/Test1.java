package test_service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jay.entity.Song;
import com.jay.mapper.SongMapper;
import com.jay.service.SongService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
//@ContextConfiguration("classpath:spring-*.xml")
public class Test1 {
	
	@Autowired
	private SongMapper songMapper;
	@Autowired
	private SongService songService;
	
//	@Test
//	public void test1(){
//		List<Song> list = songService.queryAll();
//		for(Song s : list){
//			System.out.println(s);
//		}
//	}
	
//	@Test
//	public void test2(){
//		Song s = songService.queryById(5);	
//		System.out.println(s);
//	}
//	
//	@Test
//	public void test3(){
//		Song s = new Song();
//		s.setAlbum("jay");
//		s.setName("�����");
//		s.setTime(2000);
//		songService.add(s);
//	}
	
	@Test
	public void test4()throws Exception{
		Song s = new Song();
		s.setId(5);
		s.setAlbum("�Һ�æ");
		s.setName("�໨��");
		s.setTime(2007);
		
		songService.update(s);
	}
	
//	@Test
//	public void test5(){
//		songService.delete(6);
//	}
	
	
}
