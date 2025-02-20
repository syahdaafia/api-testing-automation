import pytest
import requests

@pytest.mark.order(6)
def test_delete_booking (base_url, booking_id, auth_token):
    for booking_id in booking_id:
        url = (f"{base_url}/booking/{booking_id}")
        headers = {"Content-Type": "application/json", "Cookie": f"token={auth_token}"}
        response = requests.delete(url, headers=headers)
        assert response.status_code == 201
