import {MongoClient} from "mongodb";
import express from "express";
const app=express();
async function addRecord (req,res){
    const uri = "mongodb://127.0.0.1:27017";
  const client = new MongoClient(uri);
  const db=client.db("mydb");
  const messageColl=db.collection("message");
  let inputDoc={
    message:req.query.message|| "default",
  }
  await messageColl.insetOne(inputDoc);
  await client.close();
   // string response
  // res.send("record added")

  // json response :: preferred
  resizeBy.json({opr:"success"});


}

async function findAll(req,res){
    const uri="mongodb://127.0.0.1:27017";
    const client=new MongoClient(uri);
    const db=client.db("mydb");
    const messageColl=db.collection("message");
    let list=await messageColl.find().toArray();
    await client.close();
    res.json(list);
}

app.get("/addrecord",addrecord);
app.get("/findAll",findAllMessage);
app.listen(4000);