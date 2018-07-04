package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{atribuir_assinatura_cliente_persist_description}}}
 **/
@ApiModel(description = "{{{atribuir_assinatura_cliente_persist_description}}}")
public class AtribuirAssinaturaClientePersist  {
  
  @SerializedName("idArquivo")
  private Long idArquivo = null;

  
  /**
   * {{{atribuir_assinatura_cliente_persist_id_arquivo_value}}}
   **/
  @ApiModelProperty(value = "{{{atribuir_assinatura_cliente_persist_id_arquivo_value}}}")
  public Long getIdArquivo() {
    return idArquivo;
  }
  public void setIdArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtribuirAssinaturaClientePersist {\n");
    
    sb.append("  idArquivo: ").append(idArquivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


