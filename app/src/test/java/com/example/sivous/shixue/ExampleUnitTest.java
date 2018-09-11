package com.example.sivous.shixue;

import com.example.sivous.shixue.service.ImageService;
import com.example.sivous.shixue.service.ServiceFactory;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void getImgAndDes(){
        ImageService imageService = ServiceFactory.getServiceFactory().getImageService();
        Map<List<String>, List<String>> map = imageService.getImgAndDes();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}