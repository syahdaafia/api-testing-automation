AUTH_DATA = {"username": "admin", "password": "password123"}

BOOKING_DATA = [
    {"firstname": "Charlie", "lastname": "Brown", "totalprice": 300,
     "depositpaid": False, "bookingdates": {"checkin": "2025-04-01", "checkout": "2025-04-07"},
     "additionalneeds": "Snacks"},

    {"firstname": "Daisy", "lastname": "Johnson", "totalprice": 180,
     "depositpaid": True, "bookingdates": {"checkin": "2025-05-01", "checkout": "2025-05-05"},
     "additionalneeds": "Coffee"}
]

UPDATE_DATA = [
    {"firstname": "Syahda", "lastname": "Afia", "totalprice": 100,
     "depositpaid": True, "bookingdates": {"checkin": "2026-04-01", "checkout": "2026-04-07"},
     "additionalneeds": "Noodle"},

    {"firstname": "Zacky", "lastname": "Faishal", "totalprice": 500,
     "depositpaid": False, "bookingdates": {"checkin": "2026-05-01", "checkout": "2026-05-05"},
     "additionalneeds": "Burger"}
]

UPDATE_PARTIAL_DATA = [
    {"firstname" : "Ulhaq"},
    {"firstname" : "Abror"}
]


GET_BOOKING_PARAMS = [
    {"firstname": "Abror"},
    {"firstname": "Daisy"}
]


