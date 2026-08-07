frontend:
    build: ./frontend
    depends_on:
      - backend
    environment:
      VITE_API_URL: http://localhost:8080
    ports:
      - "3000:3000"
    networks:
      - app-network