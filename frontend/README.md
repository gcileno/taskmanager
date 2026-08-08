# Mini Task Manager — Frontend

Interface web do sistema de gestão de tarefas em equipe, consumindo a API REST do back-end.

## Stack técnica

- React 19 (Vite)
- ESLint

## Como rodar

### Via Docker (recomendado)

Não requer Node instalado localmente.

```bash
docker build -t mini-task-manager-frontend .
docker run -p 3000:3000 mini-task-manager-frontend
```

Acesse: `http://localhost:3000`

### Via Docker Compose (junto com back-end e banco)

A partir da raiz do repositório:

```bash
docker-compose up --build
```

### Localmente (sem Docker)

Requer Node 20+ instalado.

```bash
npm install
npm run dev -- --host 0.0.0.0 --port 3000
```

## Variáveis de ambiente

| Variável | Descrição | Default |
|---|---|---|
| `VITE_API_URL` | URL base da API do back-end | `http://localhost:8080` |

## Estrutura

```
frontend/
├── src/
│   ├── App.jsx
│   └── main.jsx
├── Dockerfile
├── .dockerignore
└── vite.config.js
```
