import pytest

def test_create_auth(auth_token):
    assert auth_token is not None
    assert isinstance(auth_token, str)
    print(f"✅ Token berhasil dibuat: {auth_token}")