import pytest
import requests
import json
from test_data import UPDATE_DATA

@pytest.mark.order(3)
def test_update_booking(base_url, booking_id, auth_token):
    bookingid = booking_id[0]
    for data in UPDATE_DATA:
        url = (f"{base_url}/booking/{bookingid}")
        headers ={"Content-Type" : "application/json", "Cookie" : f"token= {auth_token}"}
        response = requests.put(url, headers=headers, json=data)
        assert response.status_code == 200
        print(f"\n {json.dumps(response.json(), indent=4)}")

