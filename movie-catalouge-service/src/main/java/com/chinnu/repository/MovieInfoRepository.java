package com.chinnu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chinnu.entity.MovieInfo;

@Repository
public interface MovieInfoRepository  extends JpaRepository<MovieInfo,Long>{

}
