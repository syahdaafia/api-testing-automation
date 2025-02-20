import pytest
import requests
import json
from test_data import UPDATE_PARTIAL_DATA

@pytest.mark.order(4)
def test_test_update_partial_booking(base_url,booking_id, auth_token):
    bookingid = booking_id[0]
    for data in UPDATE_PARTIAL_DATA:
        url = (f"{base_url}/booking/{bookingid}")
        headers = {"Content-Type" : "application/json", "Cookie": f"token={auth_token}"}
        response = requests.patch(url, headers=headers, json=data)
        assert response.status_code == 200
        print(f"✅ Partial update berhasil untuk booking {bookingid}:\n{json.dumps(response.json(), indent=4)}")
