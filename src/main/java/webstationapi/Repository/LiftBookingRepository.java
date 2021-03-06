package webstationapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webstationapi.Entity.Lift;
import webstationapi.Entity.LiftBooking;

import java.util.List;

public interface LiftBookingRepository extends JpaRepository<LiftBooking, Long> {

    List<LiftBooking> findAllByUserId(int userId);
}
