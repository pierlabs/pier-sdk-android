package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{usuario_senha_forte_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{usuario_senha_forte_persistencia_descricao}}}")
public class UsuarioSenhaFortePersistencia  {
  
  @SerializedName("idPlataforma")
  private Integer idPlataforma = null;

  
  /**
   * {{{usuario_senha_forte_persistencia_id_plataforma_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_senha_forte_persistencia_id_plataforma_descricao}}}")
  public Integer getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Integer idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioSenhaFortePersistencia {\n");
    
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


