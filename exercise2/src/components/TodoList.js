import React,{useState} from 'react';
import './ToDoList.css';
import axios from 'axios';



export const ToDoList= ()=>   {
    const[product,setProduct]= useState([]);
    const  [oder,setOrder]= useState([]);
    const  [delivery,setDelivery]= useState([]);


        const getAllProduct= async()=> {
            const response= await axios.get("http://localhost:8080/api/ex2/product/getAll");
                            console.log(response.data);
                              setProduct(response.data);
                        
                    }
                    const closeProduct= ()=> {
                        setProduct([]);
                                    
                                }
       
    
       const getAllOrder= async ()=> {
        const response= await axios.get("http://localhost:8080/api/ex2/order/getAll");
                 console.log(response.data);
                setOrder(response.data);
                    
      }
      const closeOrder= ()=> {
        setOrder([]);
                    
                }
      
    
       const getAllDelivery= async()=> {
       const response=await axios.get("http://localhost:8080/api/ex2/delivery/getAll");
                          console.log(response.data);
                          setDelivery(response.data);
                       
      }
      const closeDelivery= ()=> {
        setDelivery([]);
                    
                }
      

        return(
            <div className='toDoList' style={{textAlign: 'center'}} >
                <div className='product'>
                <button  onClick={getAllProduct}>Visualizza lista products</button>
             <button  onClick={closeProduct}>Chiudi lista products</button>
             
                </div>
             <div className='order'>
             <button  onClick={getAllOrder}>Visualizza lista orders</button>
             <button  onClick={closeOrder}>Chiudi lista order</button>
             </div>
             
             <div className='delivery'>
             <button  onClick={getAllDelivery}>Visualizza lista deliveries</button>
             <button  onClick={closeDelivery}>Chiudi lista deliveries</button>
             </div>
             

             {product.length > 0 && product.map(p =>
                <div>
                <h3>Elemento:</h3>
                    <div key={p.id}>{p.id}</div>
                    <div key={p.name}>{p.name}</div>
                </div>
                )}

                {oder.length > 0 && oder.map(m =>
                <div>
                <h3>Elemento:</h3>
                    <div key={m.id}>{m.id}</div>
                    <div key={m.numProdotto}>{m.numProdotto}</div>
                </div>
                )}

                {delivery.length > 0 && delivery.map(t =>
                <div>
                <h3>Elemento:</h3>
                    <div key={t.id}>{t.id}</div>
                    <div key={t.città}>{t.città}</div>
                    <div key={t.consegnato}>{t.consegnato}</div>
                </div>
                )}

    </div> 
     );
}