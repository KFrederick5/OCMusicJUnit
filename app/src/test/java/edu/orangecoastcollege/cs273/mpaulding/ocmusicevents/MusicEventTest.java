package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by kfrederick5 on 11/22/2016.
 */

public class MusicEventTest {

    private MusicEvent mMusicEvent;

    @Before
    public void setUp() throws Exception {

        mMusicEvent = new MusicEvent();
        mMusicEvent.setTitle("Test Title");
        mMusicEvent.setDate("Friday");
        mMusicEvent.setDay("11/15/16");
        mMusicEvent.setAddress1("Test Add 1");
        mMusicEvent.setAddress2("Test Add 2");
        mMusicEvent.setImageName("Picture");
        mMusicEvent.setLocation("OCC");
        mMusicEvent.setTime("2:00 PM");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {
        assertEquals("Expected title to be Test Title",
                "Test Title", mMusicEvent.getTitle());
    }

    @Test
    public void getDate() throws Exception {
        assertEquals("Friday", mMusicEvent.getDate());
    }

    @Test
    public void getDay() throws Exception {
        assertEquals("11/15/16", mMusicEvent.getDay());
    }

    @Test
    public void getTime() throws Exception {
        assertEquals("2:00 PM", mMusicEvent.getTime());
    }

    @Test
    public void getLocation() throws Exception {
        assertEquals("OCC", mMusicEvent.getLocation());
    }

    @Test
    public void getAddress1() throws Exception {
        assertEquals("Test Add 1", mMusicEvent.getAddress1());
    }

    @Test
    public void getAddress2() throws Exception {
        assertEquals("Test Add 2", mMusicEvent.getAddress2());
    }

    @Test
    public void getImageName() throws Exception {
        assertEquals("Picture", mMusicEvent.getImageName());
    }
}