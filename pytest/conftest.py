import pytest
import requests
from test_data import AUTH_DATA
from test_data import BOOKING_DATA

@pytest.fixture(scope="session")
def base_url():
    return "https://restful-booker.herokuapp.com"

@pytest.fixture(scope="session")
def auth_token (base_url):
    url = f"{base_url}/auth"
    payload = AUTH_DATA
    response = requests.post(url, json=payload)
    assert response.status_code == 200
    return response.json()["token"]

@pytest.fixture(scope="session")
def booking_id (base_url):
    url = f"{base_url}/booking"
    headers = {"Content-Type": "application/json"}
    created_ids = []
    for data in BOOKING_DATA:
        response = requests.post(url, json=data, headers=headers)
        assert response.status_code == 200
        created_ids.append(response.json()["bookingid"])

    return created_ids

