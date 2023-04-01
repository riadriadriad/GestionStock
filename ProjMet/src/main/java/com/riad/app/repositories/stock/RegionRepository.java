package com.riad.app.repositories.stock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.riad.app.entities.stock.Region;
@RepositoryRestResource
 public interface RegionRepository extends JpaRepository<Region, Long> {
 public Region findByNomRegion(String nom);
 public List<Region> findByNomRegionContains(String mc);
}
