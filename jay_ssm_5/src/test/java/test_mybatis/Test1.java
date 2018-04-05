package test_mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jay.entity.PageBean;
import com.jay.entity.Song;
import com.jay.mapper.SongMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Test1 {
	
	@Autowired
	private SongMapper songMapper;
	
//	@Test
//	public void test1(){
//		
//		PageBean pb = new PageBean();
//		List<Song> l = songMapper.queryAll();
//		int totalRecord = l.size();
//		pb.caculateSomeProperty();
//		
//		List<Song> list = songMapper.queryByPage(pb);
//		for(Song s: list){
//			System.out.println(s);
//		}
//	}
//	
//	@Test
//	public void test4(){
//		Song s = new Song();
//		s.setId(5);
//		s.setAlbum("��Ȼ������");
//		s.setName("ҹ�ĵ�����");
//		s.setTime(2006);
//		
//		songMapper.update(s);
//	}
	@Test
	public void insert()throws Exception
	{
		for (int i = 0 ; i < 50; i++){
			Song s = new Song("借口","七里香", i*100);
			songMapper.add(s);
		}
	}
}
