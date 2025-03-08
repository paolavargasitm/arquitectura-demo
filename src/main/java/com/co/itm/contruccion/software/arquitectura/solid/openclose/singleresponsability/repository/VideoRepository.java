package com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.repository;

import com.co.itm.contruccion.software.arquitectura.solid.openclose.singleresponsability.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {}