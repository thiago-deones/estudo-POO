import {useState} from 'react'

const EventHandlingEx = () => {

  const handleClick = () => {
    alert('oi...');
  };

  const handleClick2 = (name) => {
    alert(`Olá ${name}`);
  };


  const [name, setName] = useState('');


  const handleSubmit = (e) => {
    e.preventDefault();

    alert('Formulário enviado!');
  };

  return (
    <div>
        <button onClick={() => alert('oi')}>click aqui</button>
        <button onClick={handleClick}>click aquiv 2</button>
        <br />
        <button onClick={() => handleClick2('Ana')}>Dizer Olá Ana</button>
        <button onClick={() => handleClick2('Pedro')}>Dizer Olá Pedro</button>
        <br />
        <form onSubmit={handleSubmit}>
          <input type="text" value={name} onChange={(e) => setName(e.target.value)}placeholder='Digite seu nome'/>
          <input type="submit" value='Enviar' />
        </form>
    </div>
  );
};

export default EventHandlingEx