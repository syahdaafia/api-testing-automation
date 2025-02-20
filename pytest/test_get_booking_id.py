import pytest
import requests
import json

@pytest.mark.order(2)
def test_get_booking_id(base_url, booking_id):
    for bookingid in booking_id:
        url = (f"{base_url}/booking/{bookingid}")
        response = requests.get(url)
        assert response.status_code == 200
        booking_data = response.json()
        print(f"\n {json.dumps(booking_data, indent=4)}")
    
