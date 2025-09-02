package com.vik.projects.booknstay.repository;

import com.vik.projects.booknstay.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
