const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split('\n');

let [n, m, v] = input[0].split(' ').map(Number);

// 0번 인덱스를 사용하지 않고, 좌표를 그대로 사용하기 위해 길이를 +1해서 초기화
let graph = new Array(n + 1);

// 배열 안에 배열을 선언(2차원 배열)
for (let i = 0; i < graph.length; i++) {
  graph[i] = [];
}

// 간선 연결 상태 저장
for (let i = 0; i < m; i++) {
  let [from, to] = input[i + 1].split(' ').map(Number);
  graph[from].push(to);
  graph[to].push(from);
}

// 작은 것 부터 방문하라고 되어있기에, 오름차순 정렬
graph.forEach((element) => {
  element.sort((a, b) => a - b);
});

// 방문 사실을 저장 할 배열을 초기화
let visited = new Array(n + 1).fill(0);
let ans_dfs = [];

// dfs
const DFS = (v) => {

  // 이미 방문했다면 return으로 빠져나옴
  if (visited[v]) {
    return;
  }

  // 방문 사실 저장
  visited[v] = 1;

  // 현재 방문 값 저장
  ans_dfs.push(v);

  // 인접한 정점 배열을 차례로 돌며 방문하지 않은 정점 방문
  for (let i = 0; i < graph[v].length; i++) {
    let next = graph[v][i];

    // 방문하지 않았다면 재귀
    if (visited[next] === 0) {
      DFS(next);
    }
  }
};

DFS(v);
console.log(ans_dfs.join(' '));

// BFS
let ans_bfs = [];

// 방문 배열 초기화
visited.fill(0);

const BFS = (v) => {
  let q = [v];

  // 방문할 정점이 남지 않을 때까지
  while (q.length) {
    // 방문할 정점 배열의 첫 번째 원소 삭제 후 저장
    let x = q.shift();

    // 이미 방문했다면 continue
    if (visited[x] === 1) {
      continue;
    }

    // 방문 사실 저장
    visited[x] = 1;

    // 결과 변수에 정점 삽입
    ans_bfs.push(x);

    // 인접한 정점 배열을 
    for (let i = 0; i < graph[x].length; i++) {
      let next = graph[x][i];
      if (visited[next] === 0) {
        q.push(next);
      }
    }
  }
};

BFS(v);
console.log(ans_bfs.join(' '));
