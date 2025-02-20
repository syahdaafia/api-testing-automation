import pytest
import requests
from test_data import GET_BOOKING_PARAMS 

@pytest.mark.order(5)
def test_get_by_param(base_url):
    url = f"{base_url}/booking"
    headers = {"Content-Type": "application/json"}

    for params in GET_BOOKING_PARAMS:  
        response = requests.get(url, headers=headers, params=params)
        assert response.status_code == 200
