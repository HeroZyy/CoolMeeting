package org.javaboy.meeting.service;

import org.javaboy.meeting.mapper.MeetingMapper;
import org.javaboy.meeting.model.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author zyy
 * @微信 z17779287224
 * @GitHub https://github.com/HeroZyy
 */
@Service
public class MeetingService {
    @Autowired
    MeetingMapper meetingMapper;
    public Integer addMeeting(Meeting meeting, Integer[] mps) {
        meeting.setReservationtime(new Date());
        Integer result = meetingMapper.addMeeting(meeting);
        meetingMapper.addParticipants(meeting.getMeetingid(), mps);
        return result;
    }
}
