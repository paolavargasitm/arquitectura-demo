package com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.service;

import com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.model.Video;
import com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public void persist(Video video) {
        videoRepository.save(video);
    }
}