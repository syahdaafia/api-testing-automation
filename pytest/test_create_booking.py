import pytest

@pytest.mark.order(1)
def test_create_booking(booking_id):
    assert len(booking_id) > 0
    print(f"booking id berhasil dibuat: {booking_id}")