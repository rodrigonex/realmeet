package br.com.sw2you.realmeet.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sw2you.realmeet.domain.entity.Room;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
