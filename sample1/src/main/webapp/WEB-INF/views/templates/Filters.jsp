
<!-- Page Content -->
<div class="container">
	<row>
	<h2>Filters</h2>

	<form class="form-inline">
		<div class="form-group col-lg-3">
			<label for="exampleInputName2">Name</label> <input type="text"
				class="form-control" id="exampleInputName2" placeholder="Jane Doe">
			<span class="help-block">This is some help text that breaks
				onto a new line and may extend more than one line.</span>

		</div>
		<div class="form-group col-lg-3">
			<label for="exampleInputEmail2">Email</label> <input type="email"
				class="form-control" id="exampleInputEmail2"
				placeholder="jane.doe@example.com"> <span class="help-block">This
				is some help text that breaks onto a new line and may extend more
				than one line.</span>

		</div>

		<!-- begining of dates -->
		<div class="form-group col-lg-2">
			<div class='input-group date ' id='datepickerFrom'>
				<input type='text' placeholder="Date From" class="form-control " />
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-calendar"></span>
				</span>
			</div>
			<span class="help-block">This is some help text that breaks
				onto a new line and may extend more than one line.</span>
		</div>


		<div class="form-group col-lg-2">
			<div class='input-group date' id='datepickerTo'>
				<input type='text' placeholder="Date TO" class="form-control" /> <span
					class="input-group-addon"> <span
					class="glyphicon glyphicon-calendar"></span>
				</span>
			</div>
			<span class="help-block">This is some help text that breaks
				onto a new line and may extend more than one line.</span>

		</div>

		<!--end of dates -->
		<button type="submit" class="btn btn-default col-lg-1">Filter</button>
	</form>
	</row>
</div>