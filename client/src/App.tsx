import { useState, useEffect} from 'react';
import api from './Api/axiosConfig';
import './App.css';

function App() {
  const [movies, setMovies] = useState();

  const getMovies = async () => {
    try {
      const response = await api.get('/api/v1/movies');
      console.log(response.data);

      setMovies(response.data);
    } catch (err) {
      console.log(err);
    };
  };

  useEffect(() => {
    getMovies();
  }, []);
  return (
    <div className="App">
      <h1>Hello World</h1>
    </div>
  );
}

export default App;
