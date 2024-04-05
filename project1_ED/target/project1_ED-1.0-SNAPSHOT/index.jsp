<%@include file="lib/header.jsp" %> 

<div class="container mt-2">
    <h3>Datos del cliente </h3>
   
    
        <form action="SvUsuarios" method="POST">
            <div class="form-group">
              <label >Identificación</label>
              <input type="text" class="form-control" name="dni" placeholder="Digite su número de identificación">
            </div>
            <div class="form-group">
              <label >Nombres</label>
              <input type="text" class="form-control" name="nombre" placeholder="Digite nombre completo">
            </div>
            <div class="form-group">
              <label>Correo</label>
              <input type="email" class="form-control" name="correo" aria-describedby="emailHelp" placeholder="Digite su correo electrónico">
              <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div class="form-group">
              <label >Edad</label>
              <input type="text" class="form-control" name="edad" placeholder="Digite su edad">
            </div>
            <div class="form-group">
              <label >Teléfono</label>
              <input type="text" class="form-control" name="telefono" placeholder="Digite su teléfono">
            </div><br>
           <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    <br><h3>Ver lista de usuarios</h3>
    <p>Para ver usuarios cargados haga clic en el siguiente botón:</p>
    <form action="SvUsuarios" method="GET">
       <button type="submit" class="btn btn-light">Mostrar usuarios</button> 
    </form>
</div>

<%@include file="lib/footer.jsp" %> 
